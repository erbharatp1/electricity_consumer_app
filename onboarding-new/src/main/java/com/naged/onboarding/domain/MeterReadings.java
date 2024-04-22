package com.naged.onboarding.domain;

import java.util.List;

public record MeterReadings(String smartMeterId, List<ElectricityReading> electricityReadings) {

}
