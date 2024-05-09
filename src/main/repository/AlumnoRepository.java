package com.croot.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository  extends JpaRepository<Alumno, Long>{

    Object clone() throws CloneNotSupportedException;

    @Override
    boolean equals(Object arg0);

    void finalize() throws Throwable;

    @Override
    int hashCode();

    @Override
    String toString();

}