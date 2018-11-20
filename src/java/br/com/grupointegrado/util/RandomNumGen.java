/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.grupointegrado.util;

import java.util.Random;

/**
 *
 * @author alunocentro
 */
public class RandomNumGen {

    public static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		
                return r.nextInt((max - min) + 1) + min;
	}
}
