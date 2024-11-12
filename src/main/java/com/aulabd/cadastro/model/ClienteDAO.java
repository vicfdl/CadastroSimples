package com.aulabd.cadastro.model;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
//DAO = Data Access Object
@Repository
public class ClienteDAO {
    @Autowired
    DataSource dataSource;

    JdbcTemplate jdbc;

    @PostConstruct
    private void initialize(){
        jdbc = new JdbcTemplate(dataSource);
    }

    public void inserirCliente(Cliente cli){
        String sql = "INSERT INTO cliente(nome,email) VALUES(?,?)";
        jdbc.update(sql, cli.getNome(), cli.getEmail());
    }
}
