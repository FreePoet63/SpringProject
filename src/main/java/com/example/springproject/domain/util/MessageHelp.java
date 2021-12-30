package com.example.springproject.domain.util;

import com.example.springproject.domain.User;

public abstract class MessageHelp {
    public static String getAuthorName(User author) {
        return author != null ? author.getUsername() : "<none>";
    }
}
