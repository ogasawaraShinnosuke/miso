package test.main.homepage.common;

import junit.framework.Assert;
import junit.framework.TestCase;
import main.homepage.main.di.AdminMail;
import main.homepage.main.di.AdvertiseMail;
import main.homepage.main.di.CommonMail;
import main.homepage.main.di.UserMail;
import org.junit.Test;

public class MailTest extends TestCase {

    @Test
    public void testAdminMail() throws Exception {
        Assert.assertEquals(new AdminMail().execute(), CommonMail.SUCCESS_VALUE);
    }

    @Test
    public void testAdvertiseMail() throws Exception {
        Assert.assertEquals(new AdvertiseMail().execute(), CommonMail.SUCCESS_VALUE);
    }

    @Test
    public void testUserMail() throws Exception {
        Assert.assertEquals(new UserMail().execute(), CommonMail.SUCCESS_VALUE);
    }
}
