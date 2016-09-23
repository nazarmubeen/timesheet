package com.timesheet.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.timesheet.app.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}
