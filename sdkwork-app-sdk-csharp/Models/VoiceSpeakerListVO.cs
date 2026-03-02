using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VoiceSpeakerListVO
    {
        public string? CreatedAt { get; set; }
        public string? UpdatedAt { get; set; }
        public List<VoiceSpeakerItem>? Speakers { get; set; }
        public int? Total { get; set; }
        public int? Page { get; set; }
        public int? Size { get; set; }
    }
}
