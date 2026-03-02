using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class SpeakerStatisticsVO
    {
        public int? TotalSpeakers { get; set; }
        public int? ActiveSpeakers { get; set; }
        public int? InactiveSpeakers { get; set; }
    }
}
