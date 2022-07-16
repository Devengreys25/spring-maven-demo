package it.devengreys.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import it.devengreys.model.Wallet;

@Controller
@RequestMapping("/wallet")
public class WalletController {
	
	@RequestMapping("/")
	public String showPage(Model theModel) {

		theModel.addAttribute("wallet", new Wallet());
		return "wallet";
	}
	
	@RequestMapping("/info")
	public String showInfo(@RequestParam String publicKey) {
		return "walletInfo";
	}
	
	@RequestMapping("/walletForm")
	public String processForm(@ModelAttribute("wallet") Wallet theWallet) {	
		return "walletInfo";
	}
	
	@RequestMapping("/walletGenerator")
	public String generate(@ModelAttribute("wallet") Wallet theWallet) {
		String seed = theWallet.getSeed();
		theWallet = new Wallet(seed);
		System.out.println("Publickey : "+theWallet.getStringFromKey(theWallet.getPublicKey()));
		System.out.println("PrivateKey : "+theWallet.getStringFromKey(theWallet.getPrivateKey()));
		return "walletInfo";
	}
	
}
