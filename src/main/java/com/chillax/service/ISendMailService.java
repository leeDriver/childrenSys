package com.chillax.service; 
  
/** 
 * @Description:���ʼ� 
 * @author: fengjk 
 * @time:2017��4��20�� ����7:42:35 
 */  

public interface ISendMailService{  
  
  
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
    public void sendSimpleMail(String subject,String content,String toMail);
      
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
    public void sendHtmlMail(String subject,String content,String toMail);
      
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
    public void sendPictureMail(String subject,String content,String toMail,String picturePath);
      
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
    public void sendMailTakeAccessory(String subject,String content,String toMail,String accessoryPath,String accessoryName);
} 