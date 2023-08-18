package com.mybookgal.mybookgallery.in.web;

import com.mybookgal.mybookgallery.port.in.GetUsersMyBookListQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Controller
public class ViewMyBookListController {

    private final GetUsersMyBookListQuery getUsersMyBookListQuery;

    @GetMapping("/{userId}")
    @ResponseBody
    public ResponseEntity<GetUsersMyBookListQuery.UsersMyBookListInPortResponse> getMyBooks(@PathVariable Long userId) {
        GetUsersMyBookListQuery.UsersMyBookListInPortResponse usersMyBookList = getUsersMyBookListQuery.getUsersMyBookList(userId);
        return ResponseEntity.ok(usersMyBookList);
    }

}
