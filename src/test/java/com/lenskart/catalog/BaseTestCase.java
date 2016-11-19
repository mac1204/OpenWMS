/**
 * 
 */
package com.lenskart.catalog;

import junit.framework.TestCase;
import mac.open.wms.Application;

import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author dinesh
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class BaseTestCase extends TestCase {

}
