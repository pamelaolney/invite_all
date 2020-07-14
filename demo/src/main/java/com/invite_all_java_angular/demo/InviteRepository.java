package com.invite_all_java_angular.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
interface InviteRepository extends JpaRepository<Invite, Long>{
}
