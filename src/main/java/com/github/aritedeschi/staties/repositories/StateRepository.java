package com.github.aritedeschi.staties.repositories;

import com.github.aritedeschi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
