package com.vika.springit.sevice;

import com.vika.springit.domain.Role;
import com.vika.springit.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    private final RoleRepository roleRepository;


    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role findByName(String name){
       return roleRepository.findByName(name);
    }
}
