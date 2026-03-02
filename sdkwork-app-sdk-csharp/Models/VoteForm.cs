using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VoteForm
    {
        public string? ContentType { get; set; }
        public int? ContentId { get; set; }
        public string? Rating { get; set; }
        public string? Source { get; set; }
        public string? DeviceInfo { get; set; }
    }
}
