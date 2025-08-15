package com.example.Simulatingoperationsofkaziandkaziteaestate.Mahin.ModelClass;

import java.time.LocalDate;

public class MarketingCampaign {

    private String campaignName;
    private LocalDate startDate;
    private LocalDate endDate;
    private String mediaChannel;
    private String contentDetails;

    public MarketingCampaign(String campaignName, LocalDate startDate, LocalDate endDate, String mediaChannel, String contentDetails) {
        this.campaignName = campaignName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.mediaChannel = mediaChannel;
        this.contentDetails = contentDetails;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getMediaChannel() {
        return mediaChannel;
    }

    public void setMediaChannel(String mediaChannel) {
        this.mediaChannel = mediaChannel;
    }

    public String getContentDetails() {
        return contentDetails;
    }

    public void setContentDetails(String contentDetails) {
        this.contentDetails = contentDetails;
    }

    @Override
    public String toString() {
        return "MarketingCampaign{" +
                "campaignName='" + campaignName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", mediaChannel='" + mediaChannel + '\'' +
                ", contentDetails='" + contentDetails + '\'' +
                '}';
    }
}
