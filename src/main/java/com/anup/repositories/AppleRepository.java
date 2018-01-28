package com.anup.repositories;

import com.anup.domain.Apple;
import org.springframework.data.repository.CrudRepository;

public interface AppleRepository extends CrudRepository<Apple, String> {
}
