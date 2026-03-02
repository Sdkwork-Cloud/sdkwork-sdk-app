using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class PlusApiResultListSearchHistoryVO
    {
        public List<SearchHistoryVO>? Data { get; set; }
        public string? Code { get; set; }
        public string? Msg { get; set; }
        public string? RequestId { get; set; }
        public string? Ip { get; set; }
        public string? Hostname { get; set; }
        public string? ErrorName { get; set; }
    }
}
