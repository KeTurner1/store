package com.keturner1.store.entities;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProfileRepository extends CrudRepository<Profile, Long> {

    List<Profile> findByLoyaltyPointsGreaterThan(int loyaltyPoints);
}