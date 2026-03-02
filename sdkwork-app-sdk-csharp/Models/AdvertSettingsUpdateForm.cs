using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AdvertSettingsUpdateForm
    {
        public bool? Enabled { get; set; }
        public bool? Personalized { get; set; }
        public int? MaxDailyAds { get; set; }
        public string? AdBlockLevel { get; set; }
        public bool? RewardVideoEnabled { get; set; }
        public bool? InterstitialEnabled { get; set; }
        public bool? BannerEnabled { get; set; }
    }
}
