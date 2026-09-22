package com.keturner1.store.services;

import com.keturner1.store.entities.ProfileRepository;
import com.keturner1.store.repositories.AddressRepository;
import com.keturner1.store.repositories.UserRepositoy;
import jakarta.persistence.EntityManager;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepositoy userRepositoy;
    private final ProfileRepository profileRepository;
    private final EntityManager entityManager;
    private final AddressRepository addressRepository;

    @Transient
    public void showEnityStates() {
    }

    @Transactional
    public void showRelatedEntities() {
    }

    public void fetchAddress() {
    }

    public void persistRelated() {
    }

    public void deleteRelated() {
    }

    @Transactional
    public void manageProducts() {
    }

}
