package com.ycshin.SpringBootCommunityWeb.repository;

import com.ycshin.SpringBootCommunityWeb.domain.Board;
import com.ycshin.SpringBootCommunityWeb.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
    Board findByUser(User user);
}
