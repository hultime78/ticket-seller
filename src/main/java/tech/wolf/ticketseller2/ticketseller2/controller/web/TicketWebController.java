package tech.wolf.ticketseller2.ticketseller2.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tech.wolf.ticketseller2.ticketseller2.service.TicketService;

@Controller
public class TicketWebController {

    TicketService service;

    TicketWebController(TicketService service){
        this.service=service;
    }

    @GetMapping("/")
    String index(Model model){
        model.addAttribute("ticketList",service.retrieveAll());
        return "index";
    }
}
