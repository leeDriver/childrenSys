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
 * @Description:发邮件 
 * @author: fengjk 
 * @time:2017年4月20日 下午7:42:35 
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
     * @Description:普通文本发邮件形式 
     * @param subject 主题 
     * @param content 正文 
     * @param toMail 收件人邮箱 
     * void 
     * @exception: 
     * @author: fengjk 
     * @time:2017年4月20日 下午8:06:05 
     */  
    @Override  
    public void sendSimpleMail(String subject,String content,String toMail) {  
        simpleMailMessage.setSubject(subject);  
        simpleMailMessage.setText(content);  
        simpleMailMessage.setTo(toMail);  
        mailSender.send(simpleMailMessage);  
        logger.info("邮件发送成功..");   
    }  
      
    /** 
     *  
     * @Description:html发邮件形式 
     * @param subject 主题 
     * @param content 正文 
     * @param toMail 收件人邮箱 
     * void 
     * @exception: 
     * @author: fengjk 
     * @time:2017年4月20日 下午8:06:38 
     */  
    public void sendHtmlMail(String subject,String content,String toMail) {  
        MimeMessage mailMessage = mailSender.createMimeMessage();   
        MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage);   
        try {  
            messageHelper.setTo(toMail);  
            messageHelper.setSubject(subject);   
            messageHelper.setText("<html><head></head><body><h1>"+content+"</h1></body></html>",true);  
            mailSender.send(mailMessage);   
            logger.info("邮件发送成功..");   
        } catch (MessagingException e) {  
            e.printStackTrace();  
        }   
    }  
      
    /** 
     *  
     * @Description: 带图片发邮件形式 
     * @param subject 主题 
     * @param content 正文 
     * @param toMail 收件人邮箱 
     * @param picturePath 图片路径 
     * void 
     * @exception: 
     * @author: fengjk 
     * @time:2017年4月20日 下午8:05:40 
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
            //发送邮件   
            mailSender.send(mailMessage);  
            logger.info("邮件发送成功..");   
        } catch (MessagingException e) {  
            e.printStackTrace();  
        }   
    }  
      
    /** 
     *  
     * @Description:带附件发邮件形式 
     * @param subject 标题 
     * @param content 正文 
     * @param toMail 收件人邮箱 
     * @param accessoryPath 附件路径 
     * @param accessoryName 附件名 
     * void 
     * @exception: 
     * @author: fengjk 
     * @time:2017年4月20日 下午8:05:14 
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
            logger.info("邮件发送成功..");   
        } catch (MessagingException e) {  
            e.printStackTrace();  
        }   
      
    }  
} 