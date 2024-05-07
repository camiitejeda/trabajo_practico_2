package ar.edu.unju.fi.ejercicio06.main;

import ar.edu.unju.fi.ejercicio06.interfaces.funcionales.*;
import ar.edu.unju.fi.ejercicio06.model.*;
public class Main {

	public static void main(String[] args) {

		FelinoDomestico gato = new FelinoDomestico("Garfield", (byte)45, 12f);
		Converter<FelinoDomestico, FelinoSalvaje> converter = x -> new FelinoSalvaje(x.getNombre(), x.getEdad(), x.getPeso());
		
		FelinoSalvaje felino1 = converter.convert(gato);
		converter.mostrarObjeto(felino1);
		
		FelinoSalvaje gatito = new FelinoSalvaje("Tanner", (byte)20, 186);
		if(Converter.isNotNull(gatito))
		{
			Converter<FelinoSalvaje, FelinoDomestico> converter1 = x -> new FelinoDomestico(x.getNombre(), x.getEdad(), x.getPeso());
			
			FelinoDomestico gatito2 = converter1.convert(gatito);
			converter1.mostrarObjeto(gatito2);
		}
		else
		{
			System.out.print("es nulo");
		}
		}

}