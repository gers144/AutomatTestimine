package ee.ttu.test;

import org.junit.Test;
import org.junit.Test;


import Forecast.temprature
import Forecast.highest
import Forecast.lowest
/**
 * Created by Nikita Vlassenkov on 24.09.17.
 */
public class ForecastTest {
	
	
	//What kind of temprature right now
	@Test
    public void getCurrentForecast() {
        assertTrue(false);
    }

	//3 days information
    @Test
    public void getThreeDaysForecast() {
        assertTrue(false);
    }

	//Show me temprature by my location
    @Test
    public void getForecastByGeo() {
        assertTrue(false);
    }
	
	@Test
	public void ForecastServiceTest(){
		String name = "highest";
		
		Forecast temprature = new PlusTemperature(name);
		
		Assert.assertTrue(temprature.getName().equals(name));
		
	}
	
	@Test
	public void ForecastServiceTest(){
		String name = "lowest";
		
		Forecast temprature = new MinusTemperature(name);
		
		Assert.assertTrue(temprature.getName().equals(name));
		
	}

}