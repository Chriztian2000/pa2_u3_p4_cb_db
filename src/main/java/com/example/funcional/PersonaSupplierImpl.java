package com.example.funcional;

public class PersonaSupplierImpl implements IPersonaSupplier<String>{

	@Override
	public String getID() {
		
		String cedula = "1722781000";
		
		cedula = cedula+" Christian";
		// TODO Auto-generated method stub
		return cedula;
	}



}
