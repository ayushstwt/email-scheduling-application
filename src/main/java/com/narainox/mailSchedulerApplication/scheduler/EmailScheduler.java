package com.narainox.mailSchedulerApplication.scheduler;

import com.narainox.mailSchedulerApplication.model.User;
import com.narainox.mailSchedulerApplication.repository.UserRepository;
import com.narainox.mailSchedulerApplication.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailScheduler {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmailService emailService;

    @Scheduled(cron = "0 0/1 * 1/1 * ?")
    public void fetchUsersAndSendEmail()
    {
        List<User> users = userRepository.findAll();
        for (User user:users)
        {
            emailService.sendEmail(user.getEmail(),"Demo text","Demo 1");
        }
    }
}
