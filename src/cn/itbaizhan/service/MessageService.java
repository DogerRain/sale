package cn.itbaizhan.service;

import cn.itbaizhan.bean.Message;
import org.nutz.ioc.loader.annotation.IocBean;

import java.util.List;

@IocBean(name="messageService",fields={"dao"})
public class MessageService extends BaseService{
	
	
	
	/**
	 * 添加msg
	 * @param id
	 * @return
	 */
	public Message addMessage(Message message){
		return dao.insert(message);
	}
	/**
	*查询全部message
	*/
	public List<Message> findListMessage(){
		return dao.query(Message.class,null);
	}
	/**
	 * 删除message
	 * @param id
	 * @return
	 */
	public int deleteMessage(int id){
		return dao.delete(Message.class, id);
	}
}
