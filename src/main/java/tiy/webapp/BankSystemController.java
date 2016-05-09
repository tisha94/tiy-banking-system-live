package tiy.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tiy.banking.Bank;
import tiy.banking.Customer;

import javax.servlet.http.HttpSession;

/**
 * Created by localdom on 5/8/2016.
 */
@Controller
public class BankSystemController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getPerson(HttpSession session, Model model) {
        setCommonAttributes(session, model);
        model.addAttribute("bankList", Bank.retrieveAllBanks());

        return "home";
    }

    @RequestMapping(path = "/customerList", method = RequestMethod.GET)
    public String getCustomerList(HttpSession session, Model model, String bankID) {
        setCommonAttributes(session, model);
        Bank bank = Bank.retrieve(bankID);
        model.addAttribute("bank", bank);
        System.out.println("There are " + bank.getBankCustomers().size() + " customers in the current bank");
        model.addAttribute("customerList", bank.getBankCustomers().values());
        return "customerList";
    }

    @RequestMapping(path = "/accountList", method = RequestMethod.GET)
    public String getAccountList(HttpSession session, Model model, String bankID, String customerID) {
        setCommonAttributes(session, model);
        Bank bank = Bank.retrieve(bankID);
        Customer customer = bank.getBankCustomers().get(customerID);
        model.addAttribute("bank", bank);
        model.addAttribute("accountList", customer.getBankAccounts().values());
        return "accountList";
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login(HttpSession session, String userName) {
        session.setAttribute("userName", userName);
        return "redirect:/";
    }

    // call this method at the beginning of every controller to make sure the
    // right items are set on the model ...
    public void setCommonAttributes(HttpSession session, Model model) {
        model.addAttribute("name", session.getAttribute("userName"));
    }

}
