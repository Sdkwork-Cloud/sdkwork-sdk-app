using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PrivacySettingsUpdateForm
    {
        public bool? DataCollectionEnabled { get; set; }
        public bool? PersonalizedRecommendationsEnabled { get; set; }
        public bool? ThirdPartyAnalyticsEnabled { get; set; }
        public bool? NotificationsEnabled { get; set; }
        public bool? UsageDataSharingEnabled { get; set; }
        public bool? AutoSaveEnabled { get; set; }
        public int? DataRetentionDays { get; set; }
        public bool? AiLearningEnabled { get; set; }
    }
}
