package main.java.com.bank.balance;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
    @GetMapping("/balance")
    public String checkBalance() {
        return "Your current balance is $5000.";
    }
}