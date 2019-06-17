package com.onepiece.mogens.repository;

import com.onepiece.mogens.entity.SmsInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Goo Tsung-jen
 * @create 2019-06-17  18:56
 * Innovation distinguishes between a leader and a follower.
 */
public interface SmsInfoRepository extends JpaRepository<SmsInfo, String> {
}
