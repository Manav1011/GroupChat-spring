package com.example.charappspring.repositories;

import com.example.charappspring.entities.ChatRoomEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRoomRepository extends JpaRepository<ChatRoomEntity,Long> {

}
