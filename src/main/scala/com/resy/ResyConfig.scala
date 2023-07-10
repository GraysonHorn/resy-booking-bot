package com.resy

final case class ResyKeys(apiKey: String, authToken: String)

final case class ReservationDetails(
  date: String,
  partySize: Int,
  venueId: Int,
  resTimeTypes: Seq[ReservationTimeType]
)

final case class ReservationTimeType(reservationTime: String, tableType: Option[String] = None)

object ReservationTimeType {

  def apply(reservationTime: String, tableType: String): ReservationTimeType = {
    ReservationTimeType(reservationTime, Some(tableType))
  }
}

final case class SnipeTime(hours: Int, minutes: Int)


//resyKeys.auth-token
//eyJ0eXAiOiJKV1QiLCJhbGciOiJFUzI1NiJ9.eyJleHAiOjE2OTI5MTE4MzEsInVpZCI6MTA5ODAwMDYsImd0IjoiY29uc3VtZXIiLCJncyI6W10sImxhbmciOiJlbi11cyIsImV4dHJhIjp7Imd1ZXN0X2lkIjo0OTc3NjU5Mn19.AebluszfU99UA92hwPMZOwdYrbh1k4skCHShSlclRmcMmcx2Loc-ApLrSrxPsNAPPpmj1mQBzbo9F9WAOz4k6N2_ATBObgeJFrM74sdcwgkb0H-312984vQ934mkLCyY8N1gT1Wk-i2YNqRyF7W2wU7kcoM56EL3j0jzlXJCPqbl0D4e

//resyKeys.api-key
//VbWk7s3L4KiK5fzlO7JD3Q5EYolJI7n5

//Venue IDs:
//Tatiana           65452
//63 Clinton        52711


//tableTypes
//Tatiana           "Bar"
//63 Clinton        "Dining Room"



