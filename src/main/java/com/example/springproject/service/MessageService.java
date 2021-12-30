package com.example.springproject.service;

import com.example.springproject.domain.Message;
import com.example.springproject.domain.User;
import com.example.springproject.domain.dto.MessageDto;
import com.example.springproject.repository.MessegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class MessageService {
    @Autowired
    private MessegeRepository repository;

    @Autowired
    private EntityManager manager;

    public Page<MessageDto> listMessage(Pageable pageable, String filter, User user) {
        if (filter != null && !filter.isEmpty()) {
            return repository.findByTag(filter, pageable, user);
        }else {
            return repository.findAll(pageable, user);
        }
    }

    public Page<MessageDto> messageListForUser(Pageable pageable, User currentUser, User author) {
        return repository.findByUser(pageable, author, currentUser);
    }
}
