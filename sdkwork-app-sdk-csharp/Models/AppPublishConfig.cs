using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class AppPublishConfig
    {
        public List<AppStoreListingConfig>? Stores { get; set; }
    }
}
