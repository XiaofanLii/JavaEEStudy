package com.lee.server.sessionbean;

import javax.ejb.Remote;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: lixiaofan0122@gmail.com
 * Date: 3/7/19
 * Time: 1:47 PM
 */
@Remote
public interface LibrarySessionBeanRemote {
    void addBook(String bookName);
    List<String> getBooks();
}
