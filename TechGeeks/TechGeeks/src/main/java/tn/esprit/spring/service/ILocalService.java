package tn.esprit.spring.service;

import java.util.List;

import tn.esprit.spring.entities.Local;



public interface ILocalService {
	List<Local> retrieveAllLocals();
	Local addLocal(Local l);
	Local updateLocal(Local l);
	Local retrieveLocal(int id);
	void deleteLocal(int id);
}