package cbbatte.springboot.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@Service
public class BookService {
    @Autowired
    BookRepository myBookRepository;

}
