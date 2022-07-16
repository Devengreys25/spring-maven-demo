package it.devengreys.model;

import java.security.Key;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Base64;

public class Wallet {

	
	public PrivateKey privateKey;
    public PublicKey publicKey;
    public String seed;
    
    
    public Wallet(String seed){
        generateKeyPairFromSeed(seed);
    }
    
    public Wallet(){};
    
    public void generateKeyPairFromSeed(String seed){
        try {
        	byte[] keyStart = seed.getBytes();
    		KeyPairGenerator kgen = KeyPairGenerator.getInstance("RSA");
    		SecureRandom sr = SecureRandom.getInstance("SHA1PRNG");
    		sr.setSeed(keyStart);
    		kgen.initialize(1024, sr);
    		KeyPair keyPair = kgen.generateKeyPair();
    		privateKey = keyPair.getPrivate();
    		publicKey = keyPair.getPublic();

        }catch(Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public String getStringFromKey(Key key) {
		return Base64.getEncoder().encodeToString(key.getEncoded());
	}


	public PrivateKey getPrivateKey() {
		return privateKey;
	}

	public PublicKey getPublicKey() {
		return publicKey;
	}

	public String getSeed() {
		return seed;
	}

	public void setSeed(String seed) {
		this.seed = seed;
	}

	
    
    
	
}
