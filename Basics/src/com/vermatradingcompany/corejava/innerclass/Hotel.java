package com.vermatradingcompany.corejava.innerclass;

public class Hotel {
    private String name;
    private int totalRooms;
    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }

    public void reservedRoom(String guestName, int numberOfRooms) {
        class ReservationValidator {
            boolean valodate() {
                if (guestName == null || guestName.isEmpty()) {
                    System.out.println("Guest name cannot be empty!");
                    return false;
                }
                if (numberOfRooms < 0) {
                    System.out.println("Number of rooms cannot be negative.");
                    return false;
                }
                if (numberOfRooms + reservedRooms > totalRooms) {
                    System.out.println("We do not have enough rooms available.");
                    return false;
                }
                return true;
            }
        }

        ReservationValidator validator = new ReservationValidator();
        if (validator.valodate()) {
            reservedRooms += numberOfRooms;
            System.out.println("Reservation confirmed for " + guestName + " for " + numberOfRooms + " rooms.");
        }
        else {
            System.out.println("Reservation failed.");
        }
    }
}
