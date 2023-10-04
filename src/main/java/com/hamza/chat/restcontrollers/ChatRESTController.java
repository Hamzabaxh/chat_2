package com.hamza.chat.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hamza.chat.entities.Chat;
import com.hamza.chat.service.ChatService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ChatRESTController {
	@Autowired
	ChatService chatService ;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Chat> getAllChats() {
		return chatService.getAllChats();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Chat getChatById(@PathVariable("id") Long id) {
	return chatService.getChat(id);
	 }
	@RequestMapping(method = RequestMethod.POST)
	public Chat createChat(@RequestBody Chat chat) {
	return chatService.saveChat(chat);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Chat updateChat(@RequestBody Chat chat) {
	return chatService.updateChat(chat);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteChat(@PathVariable("id") Long id)
	{
		chatService.deleteChatById(id);
	}
	@RequestMapping(value="/chatsou/{idSou}",method = RequestMethod.GET)
	public List<Chat> getChatsBySouId(@PathVariable("idSou") Long idSou) {
	return chatService.findBySoucheIdSou(idSou);
	}
}
