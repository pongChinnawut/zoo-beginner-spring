package com.example.zoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@SpringBootApplication
public class ZooApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ZooApplication.class, args);
//		try {l
//			Integer ttt = 1648567013;
//
////			Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(ttt.toString());
//			LocalDateTime lc = LocalDateTime.ofEpochSecond(ttt, 0, ZoneOffset.UTC);
//			long dayDifference = ChronoUnit.DAYS.between(lc, LocalDateTime.now());
//			System.out.println(dayDifference);
//		} catch (Exception e) {
//			throw e;
//		}
	}

}
