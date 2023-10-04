package com.hamza.chat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.hamza.chat.entities.Chat;
import com.hamza.chat.entities.Souche;
import com.hamza.chat.repos.ChatRepository;
import com.hamza.chat.repos.SoucheRepository;
@Service

public class ChatServiceImpl implements ChatService{
	@Autowired
	ChatRepository chatRepository;
	@Autowired
	SoucheRepository soucheRepository;
	@Override
	public Chat saveChat(Chat c) {
	return chatRepository.save(c);
	}
	@Override
	public Chat updateChat(Chat c) {
	return chatRepository.save(c);
	}
	@Override
	public void deleteChat(Chat c) {
		chatRepository.delete(c);
	}
	@Override
	public void deleteChatById(Long id) {
		chatRepository.deleteById(id);
	}
	@Override
	public Chat getChat(Long id) {
	return chatRepository.findById(id).get();
	}
	@Override
	public List<Chat> getAllChats() {
	return chatRepository.findAll();
	}
	@Override
	public Page<Chat> getAllChatParPage(int page, int size) {
	return chatRepository.findAll(PageRequest.of(page, size));
	}
	@Override
	public List<Chat> findByNomChat(String nom) {
		
		return chatRepository.findByNomChat(nom);
	}
	@Override
	public List<Chat> findByNomChatContains(String nom) {
		
		return chatRepository.findByNomChatContains(nom);
	}
	@Override
	public List<Chat> findByNomPrixAdoption(String nom, Double prixAdoption) {
		
		return chatRepository.findByNomPrixAdoption(nom, prixAdoption);
	}
	@Override
	public List<Chat> findBySouche(Souche souche) {
		
		return chatRepository.findBySouche(souche);
	}
	@Override
	public List<Chat> findBySoucheIdSou(Long id) {
	
		return chatRepository.findBySoucheIdSou(id);
	}
	@Override
	public List<Chat> findByOrderByNomChatAsc() {
		
		return chatRepository.findByOrderByNomChatAsc();
	}
	@Override
	public List<Chat> trierChatsNomsprixAdoption() {
		
		return chatRepository.trierChatsNomsPrixAdoption();
	}
	@Override
	public List<Souche> getAllSouche() {
		return soucheRepository.findAll();
	}
}
