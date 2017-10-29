package com.chillax.service.impl;

import java.io.File;  

import javax.annotation.Resource;  
import javax.mail.MessagingException;  
import javax.mail.internet.MimeMessage;  
  
import org.slf4j.Logger;  
import org.slf4j.LoggerFactory;  
import org.springframework.core.io.FileSystemResource;  
import org.springframework.mail.SimpleMailMessage;  
import org.springframework.mail.javamail.JavaMailSender;  
import org.springframework.mail.javamail.MimeMessageHelper;  
import org.springframework.stereotype.Service;

import com.chillax.service.ISendMailService;  
    
  
/** 
 * @Description:���ʼ� 
 * @author: fengjk 
 * @time:2017��4��20�� ����7:42:35 
 */  
  
@Service  
public class SendMailServiceImpl implements ISendMailService{  
  
    private static final Logger logger = LoggerFactory.getLogger(SendMailServiceImpl.class);  
  
    @Resource  
    JavaMailSender mailSender;  
    @Resource  
    SimpleMailMessage simpleMailMessage;  
  
    /** 
     *  
     * @Description:��ͨ�ı����ʼ���ʽ 
     * @param subject ���� 
     * @param content ���� 
     * @param toMail �ռ������� 
     * void 
     * @exception: 
     * @author: fengjk 
     * @time:2017��4��20�� ����8:06:05 
     */  
    @Override  
    public void sendSimpleMail(String subject,String content,String toMail) {  
        simpleMailMessage.setSubject(subject);  
        simpleMailMessage.setText(content);  
        simpleMailMessage.setTo(toMail);  
        mailSender.send(simpleMailMessage);  
        logger.info("�ʼ����ͳɹ�..");   
    }  
      
    /** 
     *  
     * @Description:html���ʼ���ʽ 
     * @param subject ���� 
     * @param content ���� 
     * @param toMail �ռ������� 
     * void 
     * @exception: 
     * @author: fengjk 
     * @time:2017��4��20�� ����8:06:38 
     */  
    public void sendHtmlMail(String subject,String content,String toMail) {  
        MimeMessage mailMessage = mailSender.createMimeMessage();   
        MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage);   
        try {  
            messageHelper.setTo(toMail);  
            messageHelper.setSubject(subject);   
            messageHelper.setText("<html><head></head><body><h1>"+content+"</h1></body></html>",true);  
            mailSender.send(mailMessage);   
            logger.info("�ʼ����ͳɹ�..");   
        } catch (MessagingException e) {  
            e.printStackTrace();  
        }   
    }  
      
    /** 
     *  
     * @Description: ��ͼƬ���ʼ���ʽ 
     * @param subject ���� 
     * @param content ���� 
     * @param toMail �ռ������� 
     * @param picturePath ͼƬ·�� 
     * void 
     * @exception: 
     * @author: fengjk 
     * @time:2017��4��20�� ����8:05:40 
     */  
    public void sendPictureMail(String subject,String content,String toMail,String picturePath){  
        MimeMessage mailMessage = mailSender.createMimeMessage();   
        MimeMessageHelper messageHelper;  
        try {  
            messageHelper = new MimeMessageHelper(mailMessage,true);  
            messageHelper.setTo(toMail);  
            messageHelper.setSubject(subject);   
            //messageHelper.setText("<html><head></head><body><h1>" + content +"</h1><img src=/"+cid:aaa + /"/></body></html>",true);   
            FileSystemResource img = new FileSystemResource(new File(picturePath));   
            messageHelper.addInline("aaa",img);   
            //�����ʼ�   
            mailSender.send(mailMessage);  
            logger.info("�ʼ����ͳɹ�..");   
        } catch (MessagingException e) {  
            e.printStackTrace();  
        }   
    }  
      
    /** 
     *  
     * @Description:���������ʼ���ʽ 
     * @param subject ���� 
     * @param content ���� 
     * @param toMail �ռ������� 
     * @param accessoryPath ����·�� 
     * @param accessoryName ������ 
     * void 
     * @exception: 
     * @author: fengjk 
     * @time:2017��4��20�� ����8:05:14 
     */  
    public void sendMailTakeAccessory(String subject,String content,String toMail,String accessoryPath,String accessoryName){  
        MimeMessage mailMessage = mailSender.createMimeMessage();   
        MimeMessageHelper messageHelper;  
        try {  
            messageHelper = new MimeMessageHelper(mailMessage,true,"utf-8");  
            messageHelper.setTo(toMail);  
            messageHelper.setSubject(subject);   
            messageHelper.setText("<html><head></head><body><h1>"+content+"</h1></body></html>",true);   
            FileSystemResource file = new FileSystemResource(new File(accessoryPath));   
            messageHelper.addAttachment(accessoryName,file);  
            mailSender.send(mailMessage);   
            logger.info("�ʼ����ͳɹ�..");   
        } catch (MessagingException e) {  
            e.printStackTrace();  
        }   
      
    }  
} 