package org.springframework.samples.petclinic.config;

import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Cache could be disable in unit test.
 * But since we explicitly depend on jCacheCacheManager, we want caching in our tests as well
 */
@Configuration
@EnableCaching
@Profile( value = {"production","test"})
public class CacheConfig {
}
