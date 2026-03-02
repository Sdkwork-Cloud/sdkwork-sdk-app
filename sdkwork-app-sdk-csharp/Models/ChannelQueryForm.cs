using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ChannelQueryForm
    {
        public string? StartDate { get; set; }
        public string? EndDate { get; set; }
        public string? ChannelType { get; set; }
        public string? DeviceType { get; set; }
        public int? PageSize { get; set; }
        public int? PageNum { get; set; }
    }
}
