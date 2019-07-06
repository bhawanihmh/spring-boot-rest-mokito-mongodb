/**
 * 
 * 
 */
package com.bhawani.server.main;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.bhawani.utils.MyConfigProperties;

/**
 * @author Bhawani Singh Shekhawat
 *
 * @date 29-Jun-2019
 */
@EnableAutoConfiguration
@EnableConfigurationProperties(value = { MyConfigProperties.class })
public class TestHelper {

}
