package com.example.Messages.Services;

import com.example.Messages.modelo.Message;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    public List<Message> messages = new ArrayList<>();
    public Long nextId = 1L;

    public MessageService() {
        messages.add(new Message(nextId++, "Yair", "Quiero dinero", LocalDateTime.now()));
        messages.add(new Message(nextId++, "Enzo", "Quiero un trabajo", LocalDateTime.now()));
    }
    
    public List<Message> getAllMessages(){
        return messages;
    }
    
   
}
