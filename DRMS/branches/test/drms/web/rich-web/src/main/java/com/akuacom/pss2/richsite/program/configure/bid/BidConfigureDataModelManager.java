package com.akuacom.pss2.richsite.program.configure.bid;


public interface BidConfigureDataModelManager {
	
	/**
	 * Function for save bids from presentation layer data into database
	 * @param model
	 * @param file
	 */
	public void saveBidsIntoDB(BidConfigureDataModel model);
	
	/**
	 * Function for get bid configure from database
	 * @param model
	 */
	public void getBidConfigs(BidConfigureDataModel model);
	
	
}
