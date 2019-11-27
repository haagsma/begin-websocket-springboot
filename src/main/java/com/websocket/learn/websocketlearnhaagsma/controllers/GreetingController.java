package com.websocket.learn.websocketlearnhaagsma.controllers;

import com.websocket.learn.websocketlearnhaagsma.models.Greeting;
import com.websocket.learn.websocketlearnhaagsma.models.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        return new Greeting("Hello" + HtmlUtils.htmlEscape(message.getName()) + "!");
    }
}
