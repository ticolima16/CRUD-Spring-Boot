package br.com.tiagobarboza.Aula.CRUD.services.exceptions;

public class EntityNotFoundExeception extends RuntimeException{

    private static final long serialVersionUID = 1L;

	public EntityNotFoundExeception(String msg){
        super(msg);
    }
}
