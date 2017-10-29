package com.chillax.service; 
  
/** 
 * @Description:发邮件 
 * @author: fengjk 
 * @time:2017年4月20日 下午7:42:35 
 */  

public interface ISendMailService{  
  
  
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
    public void sendSimpleMail(String subject,String content,String toMail);
      
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
    public void sendHtmlMail(String subject,String content,String toMail);
      
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
    public void sendPictureMail(String subject,String content,String toMail,String picturePath);
      
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
    public void sendMailTakeAccessory(String subject,String content,String toMail,String accessoryPath,String accessoryName);
} 